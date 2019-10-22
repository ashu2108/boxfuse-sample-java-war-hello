node
{
  stage('build stage')
  {
    git 'https://github.com/ashu2108/boxfuse-sample-java-war-hello.git'
   sh ''' mvn package '''
  }
  stage('Deploy stage')
  {
    sh ' cp target/*.war /var/www/html/ '
  }
}
