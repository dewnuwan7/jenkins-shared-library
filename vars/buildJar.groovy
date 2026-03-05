#!/usr/bin/env groovy

def call(){
    echo 'building Java App..'
    sh 'mvn package'

}