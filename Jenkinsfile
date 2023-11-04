pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This stage checks out the source code from your version control system
                // For example, if you're using Git, you can use the 'git' step here
                // Example: git 'https://github.com/yourusername/yourrepository.git'
                git 'https://github.com/GabrielCorlan/RestAssured_Testing'
            }
        }

        stage('Build') {
            steps {
                // This stage builds your project using Maven
                // Example: sh 'mvn clean install'
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                // This stage executes your Selenium tests using TestNG
                // Example: sh 'mvn test'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            when {
                expression { currentBuild.resultIsBetterOrEqualTo('UNSTABLE') }
            }
            steps {
                // This stage deploys your application (if applicable)
                // Example: sh 'deploy_script.sh'
                sh 'deploy_script.sh'
            }
        }
    }

//     post {
//         always {
//             // This block will run after all stages, regardless of success or failure
//             // For example, you can clean up resources here
//         }
//     }
}
