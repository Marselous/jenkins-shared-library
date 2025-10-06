#!/user/bin/env groovy
import com.example.Docker

def call(String imageName) {
    def docker = new Docker(this)
    docker.dockerLogin()
    docker.buildDockerImage(imageName)
    docker.dockerPush(imageName)
}

// def call(String imageName) {
//     return new Docker(this).with {
//         dockerLogin()
//         buildDockerImage(imageName)
//         dockerPush(imageName)
//     }
// }