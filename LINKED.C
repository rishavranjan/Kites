#include<stdio.h>
#include<conio.h>
struct node
{
  int x;
  struct node *next;
};
void insert_at_first(struct node **p,int q)
{
  struct node *temp1=(struct node*)malloc(sizeof(struct node));
  temp1->x=q;
  temp1->next=*p;
  (*p)=temp1;

}

void insert_in_between(struct node **p,int q,int index)
{
  struct node *temp1=(struct node *)malloc(sizeof(struct node));
  struct node *temp2=*p;
  int x=1;
  temp1->x=q;
  while((temp2)!=NULL)
  {
    if(x==index-1)
    {
      temp1->next=(temp2)->next;
      (temp2)->next=temp1;
      break;
    }
    temp2=(temp2)->next;
    x++;
  }
}

void insert_at_last(struct node **p,int q)
{
  struct node *temp1=(struct node*)malloc(sizeof(struct node));
  struct node *temp2=*p;
  temp1->x=q;
  temp1->next=NULL;
  if((*p)==NULL)
  {
    *p=temp1;
    return;
  }
  while((temp2)->next!=NULL)
  {
    temp2=(temp2)->next;
  }
  (temp2)->next=temp1;
}

void delete_at_index(struct node **p,int index)
{
  struct node *temp1=*p;
  if(index==1)
  {
    *p=(temp1)->next;
    free(temp1);
    return;
  }
  else
  {
    while(index>2)
    {
      temp1=(temp1)->next;
      index--;
    }
    temp1->next=(temp1)->next->next;
  }
}

int count_iterative(struct node *p)
{
  int x=0;
  while(p!=NULL)
  {
    x++;
    p=p->next;
  }
  return x;
}

int count_recursive(struct node *p)
{
  if(p==NULL)
    return 0;
  else
    return 1+count_recursive(p->next);
}

void search_iterative(struct node *p,int q)
{
  if(p==NULL)
  {
    printf("LinkedList is empty");
    return;
  }
  else
  {
     while(p->next!=NULL)
     {
       if(p->x==q)
       {
	 printf("Element found");
	 return;
       }
       else
	 p=p->next;
     }
     printf("Element not found");
  }
}

void search_recursive(struct node *p,int q)
{
  if(p==NULL)
  {
    printf("Element not Found");
    return;
  }
  else
  {
    if(p->x==q)
       printf("Element found");
    else
      search_recursive(p->next,q);
  }
}

void swap_without_data(struct node **p,int x,int y)
{
  struct node *temp1=*p;
  if(temp1==NULL)
    return;
  while(temp1!=NULL)
  {




void display(struct node *p)
{
  while(p!=NULL)
  {
    printf("%d-->",(p)->x);
    p=(p)->next;
  }
}
void main()
{
  int a;
  struct node *head=NULL;
  struct node *temp=head;
  clrscr();
//  printf("Enter any value:-");
//  scanf("%d",&a);
//  temp=(struct node*)malloc(sizeof(struct node));
//  while(temp->next!=NULL)
//  {
//    temp=temp->next;
//  }
//  temp->x=a;
//  printf("%d",temp->x);
//  temp->next=NULL;
  insert_at_first(&temp,5);
  insert_at_last(&temp,4);
  insert_at_first(&temp,6);
  insert_at_first(&temp,7);
  insert_at_first(&temp,8);
  insert_at_first(&temp,9);
  insert_at_first(&temp,10);
  insert_at_last(&temp,3);
  insert_in_between(&temp,11,5);
  display(temp);
  delete_at_index(&temp,1);
  printf("\n");
  display(temp);
  printf("\nTotal number of nodes:::::%d",count_iterative(temp));
  printf("\nTotal number of nodes:::::%d",count_recursive(temp));
  search_iterative(temp,12);
  search_recursive(temp,9);
  getch();
}
