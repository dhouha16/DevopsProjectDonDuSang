pipeline {

    agent any
   // triggers {
     // cron('*/4 * * * *')

//    }

    stages {
    //   stage ('GIT') {
     //       steps {
      //         echo "Getting Project from Git";
       //        git branch:"master", url: 'https://github.com/dhouha16/SpringBootTest-CI.git';
       //     }
        //}

       stage("Verification du version Maven") {
           steps {
                bat "cd DonDuSangBackend"
                bat "mvn -version"
            }
        }
        stage("Supprimer le contenu du dossier target") {
                    steps {
                       
                            //this step attempts to clean the files and directories generated by Maven during its build
                        dir('DonDuSangBackend') {
                        bat 'mvn clean'
                        }
                        
                    }
                }
        stage ("Creation du livrable"){
        			steps{
                        dir('DonDuSangBackend') {
        				bat "mvn package -DskipTests=true"
                         }
        			}
//         			post {
//                     success {
//                        jacoco()
//                        junit '**/target/surefire-reports/TEST-*.xml'
//                     }
//                     }
        		}


        // stage ("Lancement des Tests Unitaires"){
        // 		steps{
        // 			bat "mvn test"
        // 				}
        // 		}

//         stage('Jacoco Test '){
//         			steps{
//         				step([$class: 'JacocoPublisher',
//               					execPattern: 'target/*.exec',
//               					classPattern: 'target/classes',
//               					sourcePattern: 'src/main/java',
//               					exclusionPattern: 'src/test*'
//         				])
//         			}
//         		}

        stage("Analyse avec Sonar ") {
                	steps {
                     dir('DonDuSangBackend') {
                   	bat "mvn sonar:sonar -Dsonar.login=squ_db85c1e54c0b219a656e9a1bc387934b0c2517a6"
                     }
                	 }
               	}

        stage("Deploiement dans nexus ") {
                     steps{
                      // If you are using Windows then you should use "bat" step
                      // Since unit testing is out of the scope we skip them
                 dir('DonDuSangBackend') {
                bat "mvn deploy:deploy-file -DgroupId=tn.esprit.spring -DartifactId=timesheet-ci -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8086/repository/maven-releases/ -Dfile=target/timesheet-ci-1.0.jar"
                        }
                     }
                }

    }


}