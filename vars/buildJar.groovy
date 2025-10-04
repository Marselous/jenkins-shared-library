#!/user/bin/env groovy

def call() {
    echo 'building the applications...'
    sh 'mvn package'
}