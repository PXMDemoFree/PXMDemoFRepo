pipeline {
  agent any
  //test PR
  stages {

    stage('Pre'){
        steps{
            script{
                if(env.BRANCH_NAME.startsWith('PR-')) {
                    def prNum = env.BRANCH_NAME.replace(/^PR-/, '')
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

    stage('Build') {
      steps {
        echo prNum
      }
    }


//     stage('Source Code Analysis') {
//         sh "./gradlew sonarqube " +
//               "-Dsonar.projectKey=API-Demo-gradle " +
//               "-Dsonar.host.url=https://sonar.pirobase.de " +
//               "-Dsonar.login=5ba45215d8aedddd06f5fe7f0b3797b300227959 " +
//               "-Dsonar.pullrequest.key=1 " +
//               "-Dsonar.pullrequest.branch=GIT_BRANCH " +
//               "-Dsonar.pullrequest.base=master "
//     }

  }
}