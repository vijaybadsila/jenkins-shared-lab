def call(){
     echo "Deploying application..."
                sh "docker compose down || true"
                sh "docker compose up -d --force-recreate"
}
