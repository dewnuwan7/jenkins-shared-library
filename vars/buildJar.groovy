#!/usr/bin/env groovy

def call(){
    echo "building Java App from branch ${BRANCH_NAME}.."
    sh 'mvn package'

}