grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    inherits("global")
    log "warn"
    legacyResolve false
    repositories {
        grailsPlugins()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.2.1",
              ":rest-client-builder:1.0.3") {
            export = false
        }
        compile(":hibernate:$grailsVersion") {
			export = false
		}

        compile ":spring-events:1.2"
        compile ":quartz2:0.2.3"
    }
}