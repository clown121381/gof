package com.yang.composite;

/**
 * 组合模式：操作树形结构
 * 又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，
 * 用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 * 我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。
 * 抽象组件：构建定义叶子节点和容器节点的共同点
 *
 * 容器节点：非叶子节点
 *
 */
public interface Component {
    void operation();
}
//叶子节点
interface Leaf extends Component{

}
//容器节点
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
}