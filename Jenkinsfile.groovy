node
{
  stage('build stage')
  {
    git 'https://github.com/ashu2108/boxfuse-sample-java-war-hello.git'
   sh '''sudo mvn package '''
  }
  stage('Deploy stage')
  {
    sh 'sudo cp target/*.war /usr/share/tomcat/webapps/'
  }
}
