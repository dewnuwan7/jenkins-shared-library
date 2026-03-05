
#!/usr/bin/env groovy

def call(){
     echo "building Docker image.."
        withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            sh "docker build -t dewnuwan/java-maven-app:jma-${params.VERSION} ."
            sh "echo $PASS | docker login -u $USER --password-stdin"
        }
}