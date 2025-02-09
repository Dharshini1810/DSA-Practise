## Git vs GitHub
### What is Git?
Git is a distributed version control system (DVCS) used to track changes in source code efficiently.
It enables developers to maintain different versions of their code and collaborate seamlessly.
Git can be used via CLI (Command Line Interface) or GUI (Graphical User Interface).
It helps in managing a local repository, tracking modifications, and committing changes.

### What is GitHub?
GitHub is a cloud-based hosting service for Git repositories, enhancing collaboration and accessibility.
It provides a graphical interface for managing repositories, making them more organized and shareable.
Features include issue tracking, pull requests, CI/CD pipelines, and role-based access control.
It allows multiple contributors to work together efficiently by forking, cloning, and merging branches.

### Analogy
Git is like a personal file system that tracks versions of your code.
GitHub is like Google Drive for Git repositories—providing cloud storage, collaboration tools, and version control in one place.

### Essential Git Commands
#### 1️⃣ Initialize a New Repository
##### git init
Creates a .git folder inside the current directory, which starts tracking files.

#### 2️⃣ Check the Status of the Repository
##### git status
Displays the state of the working directory and staging area, including untracked and modified files.

#### 3️⃣ Adding Files to the Staging Area
##### git add <file> 
  - Stage a single file
##### git add . 
  - Stage all modified files

The staging area acts as an intermediate space between the working directory and the repository, allowing you to prepare files before committing.

Undo Staging (Move Back to Working Directory)
##### git restore --staged <file>

#### 4️⃣ Committing Changes
##### git commit -m "Descriptive commit message"
Saves staged changes in the Git history with a unique commit hash.

View Commit History
##### git log --oneline --graph --all
Shows a summarized commit history in a visual format.

#### 5️⃣ Undo Changes (Reverting to a Previous State)
View Commit History
##### git log

Revert a Commit
##### git revert <commit-id>
Creates a new commit that undoes the changes made by a previous commit without removing history.

Hard Reset (Dangerous – Erases Commits)
##### git reset --hard <commit-id>
Moves the repository back to the specified commit, deleting all changes after it.

#### 6️⃣ Configure Git User
##### git config --global user.name "Your Name"
##### git config --global user.email "your.email@example.com"
##### git config --list - View Git configurations

This sets your identity for Git commits.

#### 7️⃣ Adding a Remote Repository
##### git remote -v - Check if a remote exists
##### git remote add origin <repository_URL> - Link a remote repo
##### git remote remove origin - Remove the remote link

The origin keyword is an alias for the remote repository.

#### 8️⃣ Pushing Changes to a Remote Repository
##### git push origin main - Push local commits to the main branch
##### git push -u origin main - Set the upstream branch (only needed the first time)

Uploads your local changes to the remote repository.

#### 9️⃣ Pulling Changes from a Remote Repository
##### git pull origin main
Fetches and merges changes from the remote repository.

#### 🔟 Cloning a Repository
##### git clone <repository_URL>
Creates a local copy of a remote repository.

#### 1️⃣1️⃣ Creating and Switching Branches
##### git branch <branch_name> - Create a new branch
##### git checkout <branch_name> - Switch to another branch (older method)
##### git switch <branch_name> - Newer method for switching branches

Merging a Branch into Main
##### git checkout main
##### git merge <branch_name>

Deleting a Branch
##### git branch -d <branch_name> - Delete a local branch
##### git push origin --delete <branch_name> - Delete a remote branch

#### 1️⃣2️⃣ Stashing Changes (Temporary Save Without Commit)
##### git stash - Stash uncommitted changes
##### git stash pop - Reapply stashed changes
##### git stash list - View saved stashes
##### git stash clear - Remove all stashed changes

#### 1️⃣3️⃣ Checking Differences in Files
##### git diff - View changes in working directory
##### git diff --staged - View changes in staging area

#### 1️⃣4️⃣ Fetching vs. Pulling
##### git fetch origin
This downloads new data from the remote repository without merging it into your working branch.

##### git pull origin main
This fetches and merges remote changes into your current branch.

#### 1️⃣5️⃣ Rebasing a Branch (Alternative to Merging)
##### git rebase <branch_name>
Moves your branch on top of another branch’s commits, creating a linear commit history.

#### 1️⃣6️⃣ Deleting a File from Git
##### git rm <file>
##### git commit -m "Removed file"
##### git push origin main
Deletes the file from both the local and remote repository.

#### 1️⃣7️⃣ Tagging a Release
##### git tag -a v1.0 -m "Version 1.0"
##### git push origin v1.0
Creates a versioned tag for easy reference in deployments.
