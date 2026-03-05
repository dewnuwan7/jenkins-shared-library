#!/usr/bin/env groovy

def call(){
    echo "Testing Maven app.."
    sh "mvn test"
}