# FromZerotoExpert 
###这里以后我将一步一步完成帅地哥的项目
2022.9.9日 我在刚开是创建web的时候一直跟着好几个教程走下来，所有的步骤都是跟教程一样的，但是localhost：8080 就是一直无法连接服务器，最后通过终端的提示上csdn搜了一下 发现是数据库的问题：问题描述在初次完成项目的构建后，启动项目时出错，提示信息“ Failed to configure a DataSource: ‘url’ attribute is not specified and no embedded datasource could be configured. ” ，这个异常很好理解，直接翻译成中文，一看便知了 “ 配置数据源失败:没有指定’url’属性，也不能配置嵌入式数据源。 ” 最终解决方法是：1.建立数据库 2.注视xml数据库连接的JDBC 3.排除 jdbc 的自动装配机制即可。这些从今天下午17.30搞到了20.30.亏我暑假上了黑马的JavaWeb，还学过几节仿牛客社区。太菜了啊！！！

