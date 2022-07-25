# First File
## New File


Started by user admin
Running as SYSTEM
Building in workspace C:\ProgramData\Jenkins\.jenkins\workspace\Jenkins_First_Job
The recommended git tool is: NONE
No credentials specified
 > git.exe rev-parse --resolve-git-dir C:\ProgramData\Jenkins\.jenkins\workspace\Jenkins_First_Job\.git # timeout=10
Fetching changes from the remote Git repository
 > git.exe config remote.origin.url https://github.com/tomarsid-98/JenkinsProject.git # timeout=10
Fetching upstream changes from https://github.com/tomarsid-98/JenkinsProject.git
 > git.exe --version # timeout=10
 > git --version # 'git version 2.36.1.windows.1'
 > git.exe fetch --tags --force --progress -- https://github.com/tomarsid-98/JenkinsProject.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git.exe rev-parse "refs/remotes/origin/development^{commit}" # timeout=10
Checking out Revision eefc6529f4fc286f71cfe4c12da539483ccb31c4 (refs/remotes/origin/development)
 > git.exe config core.sparsecheckout # timeout=10
 > git.exe checkout -f eefc6529f4fc286f71cfe4c12da539483ccb31c4 # timeout=10
Commit message: "Update readme.md"
 > git.exe rev-list --no-walk 37b6fe05db6a577365194633567ebc9278e8724e # timeout=10
[Jenkins_First_Job] $ cmd /c call C:\Windows\TEMP\jenkins13958219512987492391.bat

C:\ProgramData\Jenkins\.jenkins\workspace\Jenkins_First_Job>javac Prg1.java 

C:\ProgramData\Jenkins\.jenkins\workspace\Jenkins_First_Job>exit 0 
[Jenkins_First_Job] $ cmd /c call C:\Windows\TEMP\jenkins12816900037522277137.bat

C:\ProgramData\Jenkins\.jenkins\workspace\Jenkins_First_Job>java Prg1 30 35 
Addition of 30 and 35 is 65

C:\ProgramData\Jenkins\.jenkins\workspace\Jenkins_First_Job>exit 0 
Finished: SUCCESS
