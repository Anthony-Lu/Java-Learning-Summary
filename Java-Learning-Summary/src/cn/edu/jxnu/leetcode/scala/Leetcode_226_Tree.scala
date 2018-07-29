package cn.edu.jxnu.leetcode.scala

import cn.edu.jxnu.leetcode.TreeNode

/**
 * 翻转树
 * 226. Invert Binary Tree (Easy)
 * @author 梦境迷离
 * @time 2018年7月29日
 * @version v1.0
 */
object Leetcode_226_Tree extends App {

    def invertTree(root: TreeNode): TreeNode = {
        if (root == null)
            return null
        val left = root.left // 后面的操作会改变 left 指针，因此先保存下来
        root.left = invertTree(root.right)
        root.right = invertTree(left)
        root
    }

}