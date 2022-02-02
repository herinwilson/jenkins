freeStyleJob('job created from coed dsl') {
    logRotator(-1, 10)
    description = 'job created from coed dsl'
    scm {
        git {
            url = 'https://github.com/herinwilson/jenkins.git'
            branch = 'master'
        }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven {
            goals = 'clean package', 'maven-samples/single-module/pom.xml'
        }
    }
    publishers {
        archiveArtifacts {
            artifacts = '**/*.jar'
        }
    }
}
 
