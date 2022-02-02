freeStyleJob('job created from coed dsl') {
    logRotator(-1, 10)
    description('job created from coed dsl')
    scm {
        git("https://github.com/herinwilson/jenkins.git", master )
        }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven ('clean package', 'maven-samples/single-module/pom.xml')  
    }
    publishers {
        archiveArtifacts('**/*.jar')
        }
    }
}

