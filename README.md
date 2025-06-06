memners of the Group
1. Nebiyu Tsegaye............1501532
2. Muluken Ugamo ............1501491
3. Mahlet Fekdeweld..........1501381
4. Habtamu Inka..............1501198
   

# Library Management System

This project is a Java-based Library Management System generated from a UML model created using ArgoUML.

---

## 🛠️ Tools Used

- **ArgoUML**: For designing UML and generating Java source code.
- **VS Code**: For editing and managing code.
- **Git & GitHub**: For version control and collaboration.

---

## 📁 Project Structure

- `Book.java`: Represents a book with attributes and methods.
- `Author.java`: Represents an author.
- `Member.java`: Represents library members.
- `Librarian.java`: Manages books in the library.
- `Loan.java`: Handles borrowing and returning of books.

---

## 🔁 Git Workflow

### Commands Used

| Purpose | Command |
|--------|---------|
| Initialize repository | `git init` |
| Create .gitignore | `notepad .gitignore` (added `*.class`) |
| Stage all files | `git add .` |
| Commit changes | `git commit -m "Initial commit - Java code generated from UML"` |
| Add GitHub remote | `git remote add origin https://github.com/nebaware/Library_Management_System.git` |
| Push to GitHub | `git push -u origin master` |
| Create new branch | `git checkout -b LoanManagement` |
| Commit changes in new branch | `git add .` → `git commit -m "Implemented borrowBook and returnBook in Loan class"` |
| Push new branch | `git push origin LoanManagement` |
| Merge PR after review | Done via GitHub interface |
| Update local master | `git checkout master` → `git pull origin master` |

---

## 🌿 Branching Flow

1. **Initial Code**: Generated from UML and pushed to `master`.
2. **Feature Branch (`LoanManagement`)**: 
   - Added full functionality to `Loan.java` including `borrowBook()` and `returnBook()`.
3. **Pull Request**: Created from `LoanManagement` to `master` and merged after review.
4. **Updated Local Master**: Pulled latest changes from GitHub after merging.

---

## ✅ Contributors

- Nebaware (GitHub: [@nebaware](https://github.com/nebaware))
- mahlet(github: [@mahiliya](https://github.com/mahiliya))
- m


---

