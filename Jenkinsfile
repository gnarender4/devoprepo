pipeline {
    agent {
        label 'Jenkins-Agent'
    }

    stages {
        stage("Checkout from SCM") {
            steps {
                script {
                    // Checkout the code from SCM
                    checkout scm
                }
            }
        }

        stage("Build Application") {
            steps {
                script {
                    // Check if pom.xml file exists
                    def pomExists = fileExists('pom.xml')

                    // If pom.xml file exists, execute Maven build
                    if (pomExists) {
                        // Execute Maven build
                        sh "mvn clean package"
                    } else {
                        // Print message indicating that pom.xml file was not found
                        echo "Skipping Maven build. No pom.xml file found."
                    }
                }
            }
        }

        stage("Test Application") {
            steps {
                script {
                    // Check if pom.xml file exists
                    def pomExists = fileExists('pom.xml')

                    // If pom.xml file exists, execute Maven test
                    if (pomExists) {
                        // Execute Maven test
                        sh "mvn test"
                    } else {
                        // Print message indicating that pom.xml file was not found
                        echo "Skipping Maven test. No pom.xml file found."
                    }
                }
            }
        }
    }
}

def fileExists(String filename) {
    return file(filename).exists()
}
