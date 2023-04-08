#include <stdio.h>
#include <malloc.h>
typedef int ElemType;
typedef struct LNode {
	ElemType data;
	struct LNode* next;
}LinkNode;


void CreateList(LinkNode*& L, ElemType a[], int n) {
	LinkNode* s;
	int i;
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = NULL;
	for ( i = 0; i < n; i++)
	{
		s= (LinkNode*)malloc(sizeof(LinkNode));
		s->data = a[i];
		s->next = L->next;
		L->next = s;
	}
	s = L->next;
	while (s->next!=NULL)
		s = s->next;
		s->next = L;
}

void CreateListR(LinkNode*& L, ElemType a[], int n) {
	LinkNode* s,*r;
	int i;
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = NULL;
	r = L;
	for ( i = 0; i < n; i++)
	{
		s = (LinkNode*)malloc(sizeof(LinkNode));
		s->data = a[i];
		r->next = s;
		r = s;
	}
	r->next = L;
}


void InitList(LinkNode*& L) {
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = L;
}


void DestroyList(LinkNode*& L) {
	LinkNode* pre = L, * p = pre->next;
	while (p != L)
	{
		free(pre);
		pre = p;
		p = pre->next;
	}
	free(pre);
}


bool ListEmpty(LinkNode* L) {
	return (L->next == L);
}


int ListLength(LinkNode* L) {
	int i = 0;
	LinkNode* p = L;
	while (p->next != L) {
		i++;
		p = p->next;
	}
	return (i);
}


void DispList(LinkNode* L) {
	LinkNode* p = L->next;
	while (p != L) {
		printf("%c", p->data);
		p = p->next;
	}
	printf("\n");
}


bool GetElem(LinkNode* L, int i, ElemType& e) {
	int j = 1;
	LinkNode* p = L->next;
	if (i < 0||L->next==L)return false;
    if(i==1)
	{
		e = L->next->data;
	}
	else {
		while (j < i && p != L) {
			j++;
			p = p->next;
		}
		if (p == L)
			return false;
		else {
			e = p->data;
			return true;
		}
	}
}


int LocateElem(LinkNode* L, ElemType e) {
	int i = 1;
	LinkNode* p = L->next;
	while (p != L && p->data != e) {
		p = p->next;
		i++;
	}
	if (p == L)
		return 0;
	else
		return i;
}


bool ListInsert(LinkNode*& L, int i, ElemType e) {
	int j = 1;
	LinkNode* p = L, * s;
	if (i <= 0)return false;
	if (p->next == L || i == 1) {
		s = (LinkNode*)malloc(sizeof(LinkNode));
		s->data = e;
		s->next = p->next;
		p->next = s;
		return true;
	}
	else {
		p = L->next;
		while (j < i - 2 && p != L) {
			j++;
			p = p->next;
		}
		if (p == L)
			return false;
		else
		{
			s = (LinkNode*)malloc(sizeof(LinkNode));
			s->data = e;
			s->next = p->next;
			p->next = s;
			return true;
		}
	}
}


bool ListDelete(LinkNode*& L, int i, ElemType& e) {
	int j = 0;
	LinkNode* p = L, * q;
	if (i<=0||L->next==L)
		return false;
	if (i == 1)
	{
		q = L->next;
		e = q->data;
		L->next = q->next;
		free(q);
		return true;
	}
	else {
		p = L->next;
		while (j < i - 2 && p != L) {
			j++;
			p = p->next;
		}
		if (p == L)
			return false;
		else
		{
			q = p->next;
			e = q->data;
			p->next = q->next;
			free(q);
			return true;
		}
	}
}

int main() {
	LinkNode* h;
	ElemType e;
	printf("ѭ��������Ļ����������£�\n");
	printf("��1����ʼ��ѭ��������h\n");
	InitList(h);
	printf("(2)���β���β�巨����Ԫ��a,b,c,d,e\n");
	ListInsert(h, 1, 'a');
	ListInsert(h, 2, 'b');
	ListInsert(h, 3, 'c');
	ListInsert(h, 4, 'd');
	ListInsert(h, 5, 'e');
	printf("��3�����ѭ��������h��"); DispList(h);
	printf("(4)ѭ��������h���ȣ�%d\n", ListLength(h));
	printf("(5)ѭ��������Ϊ%s\n", (ListEmpty(h) ? "��" : "�ǿ�"));
	GetElem(h, 3, e);
	printf("��6)ѭ��������h������Ԫ�أ�%c\n", e);
	printf("(7)Ԫ��a��λ�ã�%d\n", LocateElem(h, 'a'));
	printf("(8)�ڵ�4��Ԫ��Ϊλ���ϲ���fԪ��\n");
	ListInsert(h, 4, 'f');
	printf("(9)���ѭ��������h:"); DispList(h);
	printf("(10)ɾ��h�ĵ�����Ԫ��\n");
	ListDelete(h, 3, e);
	printf("(11)���ѭ��������h:"); DispList(h);
	printf("(12)�ͷ�ѭ��������h\n");
	DestroyList(h);
	return 1;
}
