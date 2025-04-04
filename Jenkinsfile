pipeline {
    agent any

    environment {
        SONAR_SCANNER_HOME = 'C:\\sonar-scanner-5.0.1.3006-windows\\bin'
        SONAR_HOST_URL = 'http://localhost:9000'
        SONAR_PROJECT_KEY = 'MyProject'
        SONAR_LOGIN = 'squ_6c26d884758d2e42299b08cb5b1467f1f529d2c8'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/abdirahim888/gif.git'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('MySonarQube') {
                    bat "${SONAR_SCANNER_HOME}\\sonar-scanner -Dsonar.projectKey=${SONAR_PROJECT_KEY} -Dsonar.sources=src -Dsonar.host.url=${SONAR_HOST_URL} -Dsonar.login=${SONAR_LOGIN}"
                }
            }
        }
    }
}
