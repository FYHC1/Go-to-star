#include <stdio.h>
#include <malloc.h>
typedef char ElemType;
typedef struct linknode {
	ElemType data;
	struct linknode* next;
}LinkStNode;

void InitStack(LinkStNode*& s) {
	s = (LinkStNode*)malloc(sizeof(LinkStNode));
	s->next=NULL;
}

void DestoryStack(LinkStNode*& s) {
	LinkStNode* p = s->next;
	while (p != NULL) {
		free(s);
		s = p;
		p = p->next;
	}
	free(s);
}

bool StackEmpty(LinkStNode* s) {
	return (s->next == NULL);
}

void Push(LinkStNode*& s, ElemType e) {
	LinkStNode* p;
	p= (LinkStNode*)malloc(sizeof(LinkStNode));
	p->data = e;
	p->next = s->next;
	s->next = p;
}

bool Pop(LinkStNode*& s, ElemType& e) {
	LinkStNode* p;
	if (s->next == NULL)
		return false;
	p = s->next;
	e = p->data;
	s->next = p->next;
	free(p);
	return true;
}

bool GetTop(LinkStNode* s, ElemType& e) {
	if (s->next == NULL)
		return false;
	e = s->next->data;
	return true;
}

int main() {
	ElemType e;
	LinkStNode* s;
	printf("��ջs�Ļ����������£�\n");
	printf("(1)��ʼ��ջs\n");
	InitStack(s);
	printf("(2)ջΪ%s\n", (StackEmpty(s) ? "��" : "�ǿ�"));
	printf("(3)���ν�ջԪ��a,b,c,d,e\n");
	Push(s, 'a');
	Push(s, 'b');
	Push(s, 'c');
	Push(s, 'd');
	Push(s, 'e');
	printf("(4)ջΪ%s\n", (StackEmpty(s) ? ("��") : ("�ǿ�")));
	printf("(5)��ջ˳��");
	while (!StackEmpty(s))
	{
		Pop(s, e);
		printf("%c", e);
	}
	printf("\n");
	printf("(6)ջΪ%s\n", (StackEmpty(s) ? ("��") : ("�ǿ�")));
	printf("(7)�ͷ�ջ\n");
	DestoryStack(s);
	return 1;
}
