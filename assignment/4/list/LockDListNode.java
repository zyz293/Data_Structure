/*LockDListNode.java*/

package list;

public class LockDListNode extends DListNode {
	 LockDListNode(Object item, DListNode p, DListNode n) {
		return new DListNode(item, p, n);
	}
}