Git仓库
1.初始化版本 git init
2.添加文件到版本库 git add    git  commit
3.查看仓库状态  git status
4.显示当前所在目录 pwd
5.显示文件详细信息 LL
6.Mkdir demo2 创建demo2
7.Cd  打开目录
8.Ls -a 显示所有隐藏和未隐藏文件
9.Cat  展示当前文件内容
10.Git add test.txt  ->添加test.txt
11.查看仓库状态 git status
Git工作流
1.清理当前工作目录 clear
2.Git commit -m “文件描述”  提交文件
3.临时开发未自测的代码提交到暂存区，测试后提交到本地仓库
4.Git reset HEAD 文件名  将暂存区的修改回归到工作区
5.Git checkout --文件名 清理工作区
6.git rm 文件名 清空本地仓库
7.创建 SSH key ssh-keygen -t rsa -C”github的注册邮箱”
8.Cat id_rsa.pub 生成公钥 将内容copy到GitHub ssh key中
9.Ssh -T git@github.com查看git和github是否连接成功
添加远程仓库
1.git  remote add origin git @github.com:tylerdemo/demo4.git
2.Git pull origin master
3.Git push -u origin master
克隆仓库(将远程代码copy到本地，在本地进行开发）
1.git clone git@github.com:tylerdemo/demo4.git  git创建仓库的地址
标签管理（发布新版本时打标签通过标签回管标签）
1.git  tag 查看所有标签
2.Git tag name 创建标签
3.Git tag -a name -m “comment” 指定提交信息
4.Git tag -d name 删除标签
5.Git push origin name 标签发布