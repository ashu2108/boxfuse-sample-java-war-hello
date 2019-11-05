node {
    stage("git clone"){
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ashu2108/boxfuse-sample-java-war-hello.git']]])
    }
    stage("maven build"){
        sh "mvn clean install"
        sh "cp /var/lib/jenkins/workspace/assigmnet1/target/*.war /var/lib/tomcat/webapps"
    }
    stage("Docker"){
        sh "docker --version"
        sh "docker build -t assignment2 ."
        sh "docker tag assignment2:latest ashutoshteknur21/assignment2:latest"
        sh "docker push ashutoshteknur21/assignment2:latest"
        sh "docker-compose up -d"
    }
}
