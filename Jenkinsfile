pipeline {
  agent any
  //test PR
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }
  }
}