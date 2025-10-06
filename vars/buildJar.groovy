#!/user/bin/env groovy

def call() {
    echo "building the applications...for branch: [$BRANCH_NAME]"
    sh 'mvn clean package'
    // sh 'mvn package'
}