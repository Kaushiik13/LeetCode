int length(struct ListNode* head) {
    struct ListNode *pt = head;
    int ct = 0;
    while (pt != NULL) {
        ct++;
        pt = pt->next;  // Move to the next node
    }
    return ct;
}

struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int len = length(head);
    printf("Length of Node: %d\n", len);
    int node = len - n;
    int ct = 0;
     if (node == 0) {
        struct ListNode* newHead = head->next;
        free(head);
        return newHead;
    }
    struct ListNode* current = head;
    struct ListNode* del;
    while (current != NULL) {
        ct++;
        if (ct == node) {
            del = current->next;
            current->next = del->next;
            free(del);
            break;
        }
        current = current->next;
    }

    return head;
}

void printLinkedList(struct ListNode* head) {
    struct ListNode* current = head;
    while (current != NULL) {
        printf("%d -> ", current->val);
        current = current->next;
    }
    printf("NULL\n");
}
