freeStyleJob('job created from seed job') {
    logRotator(-1, 10)
    description('job created from seed job')
    scm {
        git("git@github.com:herinwilson/jenkins.git", '*/master' )
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
