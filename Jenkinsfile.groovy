node
{
  stage('build stage')
  {
    git 'https://github.com/ashu2108/boxfuse-sample-java-war-hello.git'
   sh ''' mvn build '''
  }
}
