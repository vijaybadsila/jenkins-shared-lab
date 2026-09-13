
def call(String ProjectName, String ImageTag, String DockerHubUser, String CredentialId = 'docker-hub-creb') {
    echo "this is push step"
    withCredentials([usernamePassword(credentialsId: CredentialId, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh """
            echo "\$DOCKER_PASS" | docker login -u "\$DOCKER_USER" --password-stdin
            docker image tag ${ProjectName}:latest ${DockerHubUser}/${ProjectName}:${ImageTag}
            docker push ${DockerHubUser}/${ProjectName}:${ImageTag}
        """
    }
}
