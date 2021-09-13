def call(Map config = [:]) { 
 // def scriptcontents = libraryResource "hello.py"
 // writeFile file: "/tmp/hello.py", text: scriptcontents
  sh "python3 /var/lib/jenkins/workspace/test@libs/shared-test/resources/hello.py"
}
