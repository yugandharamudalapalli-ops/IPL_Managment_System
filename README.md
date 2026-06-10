# Navigate to your project folder
cd path/to/your/project

# Initialize Git (if not already initialized)
git init

# Check existing remote
git remote -v

# Remove old origin (optional, if you want to connect to a different repo)
git remote remove origin

# Add your GitHub repository URL
git remote add origin https://github.com/username/repository.git

# Add all files
git add .

# Commit changes
git commit -m "Initial commit"

# Rename branch to main
git branch -M main

# Push to GitHub
git push -u origin main
