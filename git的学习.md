
#一·Git是什么
- 是一种版本控制工具，可以管理文件的历史，很快的回溯到历史的修改，并且可以看到别人的修改。
- Git 类似于 svn或者cvs，但是更加实用，更加方便。
# 二·Git的安装
- 点击这个链接：[安装地址](https://git-scm.com/)
- windows系统的选择右边电脑图标，点击Downland2.19.0 for Windows![图1](https://upload-images.jianshu.io/upload_images/14266824-4ca9b2cb4a287207.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 进入后选择自己电脑的规格32位或者64位，但是64位机可以兼容32位![图2](https://upload-images.jianshu.io/upload_images/14266824-5f82b36abe2f1344.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 下载完毕后,开始安装，一直点next就可以了  然后finsh。
# 三·Git的验证
- 打开文本控制器输入以下指令可以看自己的Git有没有安装成功![图3](https://upload-images.jianshu.io/upload_images/14266824-3fe3de1fc7d14fb7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

# 四·Github账号注册
- 进入github.com后，开始注册![图4](https://upload-images.jianshu.io/upload_images/14266824-17187b4b64c83d4c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 之后在自己的邮箱内激活就可以了。
- 点击New repository建立库 名字是自己的ID.github.io,再点击public他意思是免费的公开的库，private是收费的 私有的库，再点击Create repository![图5](https://upload-images.jianshu.io/upload_images/14266824-ba308cfba625f3d9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 创建一个文件index.html用来建立网站，内容自己一写![图6](https://upload-images.jianshu.io/upload_images/14266824-e679135cc5c44fbc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 创建成功后，在浏览器输入http://自己的ID.github.io/index就可以进入![图7](https://upload-images.jianshu.io/upload_images/14266824-7921587befb8fc80.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#五·git的简单配置
- 在桌面右键单击后，选择Git Bash Here
- 如图输入自己Github的ID和邮箱![图8](https://upload-images.jianshu.io/upload_images/14266824-c12369effa47554b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#六·git大致工作流程
- ![图9](https://upload-images.jianshu.io/upload_images/14266824-067c1c27ea75d52b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 按照图片大致介绍一下工作流程：
1.从github远端仓库下载自己所需要修改的库这时会自动checkout到自己的本地在下载时点右边链接的那个按钮可以复制地址，然后在打算存储的本地文件夹上面右键单击 git push here 敲clone的命令再复制链接过来即可下载到本地如图11所示。![图10](https://upload-images.jianshu.io/upload_images/14266824-13c3ae2a8a4b9c5a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图11](https://upload-images.jianshu.io/upload_images/14266824-53f3f31fda538795.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

2.进入本地库 添加一个a.txt文件然后敲以下命令即可添加![图12](https://upload-images.jianshu.io/upload_images/14266824-1965c739dfbea943.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
3.git commit就可以对文件注释![图13](https://upload-images.jianshu.io/upload_images/14266824-380f6a96160ab36e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图14](https://upload-images.jianshu.io/upload_images/14266824-82297de8efdbdd2c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
4.想要把本地的修改上传到github上git push 就可以了，然后输入github的账号密码就上传了![图15](https://upload-images.jianshu.io/upload_images/14266824-37ef5ed7f5eae72d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
5.如果想要下载远程的更新 git pull 就可以了
#七·git的文件状态
- 先创建一个文件夹 右键单击 git bush here 进入后可以创建一个本地仓库执行git init 这时本地会有.git文件夹(如果没有点击此电脑功能区的查看，在文件的扩展名和隐藏的项目都打上对勾)![图16](https://upload-images.jianshu.io/upload_images/14266824-a038a8aa2fc8b64a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

-可以使用下面指令让init到暂存区里面![图17](https://upload-images.jianshu.io/upload_images/14266824-79a16a21515f4d92.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 执行git commit操作 进行注释 这时所有的东西都到本地仓库里面了

![图18](https://upload-images.jianshu.io/upload_images/14266824-5c4725e0cd963cf8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图19](https://upload-images.jianshu.io/upload_images/14266824-8d47412d055f3746.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- vi init可以修改内容 保存后还在工作目录里面，git add . 就到了暂存区，之后再修改 新东西就到了工作目录了![图20](https://upload-images.jianshu.io/upload_images/14266824-7e7103060c493bb8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git diff可以看到绿色就是在工作目录里面的 而其他的在暂存区 ![图21](https://upload-images.jianshu.io/upload_images/14266824-f55a215c0c17c5eb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git diff HEAD可以看到绿色就是在工作目录里面的 而其他的在本地仓库![图22](https://upload-images.jianshu.io/upload_images/14266824-d751fdbe362283be.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git diff --cached可以看到绿色的是在暂存区里面的，而其他在本地仓库![图23](https://upload-images.jianshu.io/upload_images/14266824-f24e8f8da0721f94.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git rm --cached+文件名 可以将文件移除![图24](https://upload-images.jianshu.io/upload_images/14266824-8cbd1aee6a90aa40.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#八·git如何进行数据存储
- 首先创建一个a.txt按照图25.，git add . 保存到暂存区 git ls-files -s可以看到hash值  git cat-file -p +hash值可以显示hash值所指引的文件的内容
![图25](https://upload-images.jianshu.io/upload_images/14266824-9221e4efe0d61082.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 如图26 ，除了初始commit，之后再commit会生成parent来指向前一个commit相当于连接起来，并且还指向前一个文件如图27
![图26](https://upload-images.jianshu.io/upload_images/14266824-29d9067f1ae78b1d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图27](https://upload-images.jianshu.io/upload_images/14266824-756faf1efff38381.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#九·git分支

- git log --oneline可以看到做了哪些操作
![图 28](https://upload-images.jianshu.io/upload_images/14266824-caa34a303dd6cbb2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git branch可以看自己有哪些分支，分支前面的*是表示现在在哪个分支上， git branch+分支名 是创建新分支，git checkout+分支名 是操作到哪个分支上，也可以git checkout -b '分支名'表示创建并操作到哪个分支上，而操作哪个分支哪个分支就被HEAD指着如图30
![ 图29](https://upload-images.jianshu.io/upload_images/14266824-aba44c3fbfb4d9d4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![](https://upload-images.jianshu.io/upload_images/14266824-3e95ef41a4786f01.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图30](https://upload-images.jianshu.io/upload_images/14266824-97752d259d0fcea7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 如果在当前分支进行修改，提交后可以看出分支是哪个
![图31](https://upload-images.jianshu.io/upload_images/14266824-673616ce9825c778.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
 - 但是如果另一个分支出现了bug，git branch +分支名+要修改的分支
![图32](https://upload-images.jianshu.io/upload_images/14266824-759a85d24bca704c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 当修改完bug时  现在可以通过图形化界面清晰地看到各个分支的关系了
![图33](https://upload-images.jianshu.io/upload_images/14266824-a0390b0acd7ed7d7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 首先编辑b文件，然后提交到暂存区，再次编辑时，是在工作目录，当不想要工作目录的修改的东西时，可以  git checkout .   就是把暂存区最近的修改覆盖到工作目录
![ 图34](https://upload-images.jianshu.io/upload_images/14266824-6182c278520ff7eb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 当不想要暂存区以及工作目录的修改时，可以   git checkout HEAD .就是将本地仓库最近的修改覆盖回来
![图35](https://upload-images.jianshu.io/upload_images/14266824-bec89b321ff7195b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#十·stash命令
- 现在假如我在bug2中修改了文件但是没有commit到本地仓库中，是不能切换到其他分支的，因为其他分支的本地仓库中的文件会覆盖到这个上面，导致修改内容丢失，因此，git stash可以先暂时保存起来，就可以切换分支了。

![图36](https://upload-images.jianshu.io/upload_images/14266824-12aae11a16a2c8d2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git stash list可以看到多次stash的列表![图37](https://upload-images.jianshu.io/upload_images/14266824-a5129599a8d15c8d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 如图git stash show -p+ stash的序号可以看到那次stash的neirong
![图38](https://upload-images.jianshu.io/upload_images/14266824-b7e360094fb1350e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git stash pop可以将stash的内容重新送给文件，这样就解决了切换分支的问题
![ 图39](https://upload-images.jianshu.io/upload_images/14266824-f8ac4c45d8ac891e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- git stash apply +stash名可以使用那次暂存，但是不删除stash, git stash drop +stash名，可以删除它![图40](https://upload-images.jianshu.io/upload_images/14266824-31bf4e7ee4554769.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#十一·分支合并
- 快速合并：在大分支下git merge+要合并的分支
![图41](https://upload-images.jianshu.io/upload_images/14266824-2e224a6db53955f0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 三方合并：a的历史分支并不是master，所以合并的时候要有注释
![图42](https://upload-images.jianshu.io/upload_images/14266824-f5f7c75461eb58f9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

-当一个文件在两个分支中都被修改，这时要合并分支，会报错，打开起冲突的文件会有间隔符可以看到区别，这时git mergetool,git 会让你修改 但我们也可以自己修改
![](https://upload-images.jianshu.io/upload_images/14266824-7596f124a848a15e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图43](https://upload-images.jianshu.io/upload_images/14266824-0186fa3b09c52d3e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图44](https://upload-images.jianshu.io/upload_images/14266824-109b6e326d0e0564.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 我们用idea修改，先根据仓库的地址打开
![图45](https://upload-images.jianshu.io/upload_images/14266824-386f00967b0eb2b8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 我们为了屏蔽不必要的工程文件 所以创建一个ignore文件，不打算让git 管理的文件都可以写到ignore里面![图46](https://upload-images.jianshu.io/upload_images/14266824-1b7e1deada2ed3a6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 在ignore内输入以下文字 再 ctrl+k可以提交
![图47](https://upload-images.jianshu.io/upload_images/14266824-07fe0c55d0e07961.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 如图开始merge,选上我们要合并的分支a，点merge，ta会检测到冲突,我们继续点击merge进入这个，箭头是合并，叉号是删除，ctrl+z是撤销
![](https://upload-images.jianshu.io/upload_images/14266824-4cbe4f843fc61bd7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图48](https://upload-images.jianshu.io/upload_images/14266824-956fc74f3d198d5a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#十二·rebase命令
###1.rebase
- 先按照如图的分支创建几个文件 再ll 可以发现 c3,c2没有在dev分支上
![](https://upload-images.jianshu.io/upload_images/14266824-4a8532312eed8b3b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![](https://upload-images.jianshu.io/upload_images/14266824-9065c6456d2412d8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![图49](https://upload-images.jianshu.io/upload_images/14266824-0692a11f73c66c85.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 如果对dev进行merge 就会产生分叉，这种情况如果越多，就会很乱，如图50
![图50](https://upload-images.jianshu.io/upload_images/14266824-80daf9ab64f575c0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 因此，我们可以rebase（变基）git rebase --onto newrebase start branch
![](https://upload-images.jianshu.io/upload_images/14266824-ad376c67c3facc73.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![](https://upload-images.jianshu.io/upload_images/14266824-b1d390ccf75fcfe6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![](https://upload-images.jianshu.io/upload_images/14266824-4277aafe0cb87021.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![图51](https://upload-images.jianshu.io/upload_images/14266824-c9f7ccbbe929290c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 然后我们对dev 进行merge，可以快速合并![图52](https://upload-images.jianshu.io/upload_images/14266824-7cb075374425e4ea.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 如图 如果简写命令，会出现默认值![图53](https://upload-images.jianshu.io/upload_images/14266824-7f650d94c2b0edf7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 当然如果我们的递交push到远程仓库了，那么我们最好不要用rebase,会可能把之前的提交又交上去
###2.交互式rebase
- git rebase -i --onto master master dev是把master和dev交互式rebase，他会进入一个界面
p;pick=应用这个提交 r;reword=修改提交的说明 e;edit=可以修改提交，可以把提交拆分成好几个，在进行rebase s;squash=合并提交，比如我们可以把d1和d2合并到d0再提交 f;fixup=在同条件与squash一样，但fixup会丢弃d1的说明，squash会保留 x;exec=执行一个命令用来测试编译或运行的成功 d;drop=可以去掉某个提交，比如把d0前面的pick改为d，则b0将不会rebase到m2后边
我们直接保存退出下来我们执行git reset -- hard 9c04将它还原到上一提交
![](https://upload-images.jianshu.io/upload_images/14266824-60b977de85633048.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
###3· cherry-pick
cherry-pick命令是把某个提交所对应的修改应用到我们当前的分支上
比如我们用交互式rebase环境进行也就是图1，我们先切换到master分支上，然后执行ll查看里面只有m0 m1 m2文件，我们想要d1应用到我们的master分支上，执行git cherry-pick 369d就可以了，因此我们想用哪个提交的修改，cherry-pick可以直接帮助我们应用过来

#十三·远程分支
###1.远程分支
- 首先将远程的仓库clone一下，可以使用命令看远程和本地的分支![图54](https://upload-images.jianshu.io/upload_images/14266824-2cb11229894be201.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 然后我们在远程创建一个c0文件，将c0使用git fetch弄到本地，这时远程的master指向c0,本地的master仍然指向README,使用命令来使本地的master指向c0，快速合并![图55](https://upload-images.jianshu.io/upload_images/14266824-aeedf46d1ed8eb96.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 但是使用git pull，可以直接弄好![图56](https://upload-images.jianshu.io/upload_images/14266824-79a6624cd097854e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
###2.跟踪分支
- 跟踪分支是在本地分支和远程分支建立了一种关系，git pull就是完成远程更新和跟踪远程的master分支将它merge到本地master分支上，同样git push也是使用跟踪提交到远程仓库
- 使用git branch -vv可以看到本地分支master的跟踪分支是origin/master
![图57](https://upload-images.jianshu.io/upload_images/14266824-37c5606418684508.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 我们先在远程建立一个分支dev再更新到本地，这时本地分支并没有dev，我们使用git checkout dev,切换的同时他会建立本地分支dev，并且它的跟踪分支也是origin/dev当我们push某个分支时，远程也会修改![图58](https://upload-images.jianshu.io/upload_images/14266824-f2f10be72aa1c2df.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#十四·resest命令
- 执行git reset chash --[.|filename]是重置我们的暂存区，把commit内容覆盖过去
- 执行git reset --soft chash，更新commit的hash值，不会重置暂存区和工作区的
- 执行git reset --mixed chash，把commit覆盖到暂存区，也会更新commit的hash值
- 执行git reset --hard chash，重置commit，重置暂存区和工作区
#十五·revert命令
- 当我们不想提交某个文件时，可以git revert +hash值![图59](https://upload-images.jianshu.io/upload_images/14266824-4164324eb1d7c352.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 下来我们回到最初，执行把dev merge到master上![图60](https://upload-images.jianshu.io/upload_images/14266824-b315fe22dd8f20ef.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
-如果我们执行revert会发现报错
我们执行git show b362，发现指向两个merge一个m2一个d2，如果我们要回到dev进行的merge，则执行git revert -m 2 b362，就好了。如果push了，那么revert将会更好。
-  **介绍两本学习Git的书，[Pro Git](https://git-scm.com/book/zh/v2) 和 [Git权威指南](https://github.com/gotgit/gotgit)**







