def clone(String url, String branch) {
    echo "This is the cloning step"
    git url: url, branch: branch
    echo "Cloned successfully"
}
