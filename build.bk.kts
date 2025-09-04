plugins { // (1)
    id 'org.springframework.boot' version '3.2.0' // RELEASE 삭제
    id 'io.spring.dependency-management' version '1.1.4.RELEASE'
    id 'java'
}

group 'com.jojoldu.book'
version '1.0.4-SNAPSHOT-'+new Date().format("yyyyMMddHHmmss")
sourceCompatibility = 1.8

repositories {
    mavenCentral()
    jcenter()
}

// for Junit 5
test { // (2)
    useJUnitPlatform()
}

dependencies {
    //(3)
    implementation('org.springframework.boot:spring-boot-starter-web')

    implementation('org.springframework.boot:spring-boot-starter-test')

    // lombok
    implementation('org.projectlombok:lombok')
    annotationProcessor('org.projectlombok:lombok')
    testImplementation('org.projectlombok:lombok')
    testAnnotationProcessor('org.projectlombok:lombok')
}