#<TOC>本周学习总结：
         1.学习了git操作中的基本命令\
         2.了解了git操作的大致流程：
##分为：工作目录.暂存区.本地仓库和远程仓库
         3如何将工作目录中的文件推送到远程仓库中：
         1>创建一个新的文件夹
         2>点击git bush here
         3>git clone 粘贴复制的连接
         4>在创建的文件夹中新建自己的文件
         5>cd 需要保存的文件名
         6>git add 需要保存的文件名
         7>git commit将改变提交至仓库
         8>标写注释过程：o→所写内容→esc→shift＋zz
         9>git push 推送至远程仓库
         2.如何将远程的更新下载到工作目录：
         1>在github中创建一个新的文件
         2>在原git bush here操作中输入 git pull
##以上内容为远程仓库和工作目录的连接
         基本的git命令
      git add 把文件放到暂存区
      git add. 将所有文件放到暂存区
      git clone 把网站中项目克隆到本机
      git init 将文件初始化
      git commit -m”解释”将文件上传并且带有解释
      git push-u origin master 将暂存区的文件提交到github中
      git pull 将远程仓库中的文件推送到本地仓库
      cd 文件名 将内容暂存到切换至的文件中
      git branch 看分支信息
      git branch+分支名 创建新的分支
      git checkout+分支名 切换分支
      git branch-d+分支 删除分支
      git status 查看文件当前的状态