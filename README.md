# Spring boot Maven demo project with jib

This repository is created along with the tutorial guide.
https://spring.io/guides/gs/spring-boot/

Change Spring logging to log4j2.
https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.logging.log4j

# Log4j2 working around CVE-2021-44228 (log4shell)

Offcial Spring annoucement for CVE-2021-44228
https://spring.io/blog/2021/12/10/log4j2-vulnerability-and-spring-boot

Fix `pom.xml`

```
<properties>
    <log4j2.version>2.15.0</log4j2.version>
</properties>
```

# Usage

```sh
# just run
./mvnw spring-boot:run
```

```sh
# build container with jib
./mvnw compile jib:dockerBuild -Dimage=ghcr.io/jlandowner/springboot-log4j:0.0.1-SNAPSHOT

# run as container
docker run --rm -p 8080:8080 ghcr.io/jlandowner/springboot-log4j:0.0.1-SNAPSHOT
```
