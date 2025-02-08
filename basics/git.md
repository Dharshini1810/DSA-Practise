# Git

Git is a distributed version control system (DVCS) used for tracking changes in source code
It helps in managing and tracking different versions of your code
It can be installed either as GUI and CLI application
It helps in creating a local repository and tracks code changes in that repository

# Github

Github is a cloud-based platform for hosting git repos and colloboration tool
It basically uses git and represents and stores the repos in a more presentable and managable format
Provides a remote Git repository hosting service, issue tracking, and CI/CD integrations
It helps in colloborating your project repo with others 
Allows multiple contributors to work together easily via pull requests
Access control is granted by the repo owner to other contributors

Analogy
Git is like a file system on your computer that tracks changes in code.
GitHub is like Google Drive for Git repositories—it stores, manages, and allows collaboration in the cloud.

## Git commands

### To initiate a new git repo in a local system directory
git init

This basically create a .git folder and this following is responsible for tracking all the files 

### To add file to staging area 
touch test.txt
git add test.txt

staging area - It is an intermediate space between your working directory and git repo, where your file is being prepared to be moved to git repo
Without adding files to staging area, any changes made in the file will not be tracked

To check status of file
git status --- No changes since the file is not added to staging area

#### Working Directory (Untracked / Modified)
Where you create and edit files.
Git does not track changes yet.
Use git status to check changes.
Staging Area (Indexed)

#### Prepares selected changes for commit.
Use git add file.txt to move a file to staging.
You can review what’s staged using git status.

#### Repository (Committed)
Permanent storage of changes with history.

### moving file from staging area to unstaging area
git restore filename

### To store the changes in the history
Once after adding the file to staging area with some change, we need to permanently store the commit details, so that in future with this 
commit we can rollback to previous state during error

git commit -m "<commit message>" 

each and every commit will create a hash index value and with this hash value we can revert back to that commit 

### To revert back to previous or older commit
So once we commit all this commits are stored in list format, one above the another with different hash for each commit 
commit 3 = '= hash val
commit 2
commit 1

If you want to revert back or move back commit 1

git revert <commit-id>



