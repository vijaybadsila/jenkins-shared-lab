def clone(string url,string branch){
   echo "this is cloning step"
            git url:  "${url}",branch:"${branch}"
            echo "clone successfully"
}
