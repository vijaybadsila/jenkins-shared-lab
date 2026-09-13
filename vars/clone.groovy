def call(String url, String branch) {
    echo "Cloning repository: ${url} (branch: ${branch})"
    git url: url, branch: "*/${branch}"
    echo "Cloned successfully"
}
