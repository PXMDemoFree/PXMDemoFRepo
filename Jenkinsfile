pipeline {
  agent any
  //test PR
  stages {

    stage('Pre'){
        steps{
            script{
                if(env.BRANCH_NAME.startsWith('PR-')) {
                    sh "./gradlew sonarqube " +
                       "-Dsonar.projectKey=API-Demo-gradle " +
                       "-Dsonar.host.url=https://sonar.pirobase.de " +
                       "-Dsonar.login=5ba45215d8aedddd06f5fe7f0b3797b300227959 " +
                       "-Dsonar.pullrequest.key='${BRANCH_NAME}' " +
                       "-Dsonar.pullrequest.branch='${CHANGE_BRANCH}' " +
                       "-Dsonar.pullrequest.base=master"
                } else {
                    sh "./gradlew sonarqube " +
                       "-Dsonar.projectKey=API-Demo-gradle " +
                       "-Dsonar.host.url=https://sonar.pirobase.de " +
                       "-Dsonar.login=5ba45215d8aedddd06f5fe7f0b3797b300227959 " +
                       "-Dsonar.branch.name='${BRANCH_NAME}'"
                }
            }
        }
    }

    stage('Build') {
      steps {
        sh 'printenv'
        sh './gradlew clean build'
      }
    }

  }
}