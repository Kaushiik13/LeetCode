struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *pt1 = l1;
    struct ListNode *pt2 = l2;
    struct ListNode *head = malloc(sizeof(struct ListNode));
    int rest = 0;
    int rem = 0;
    int t = pt1->val + pt2->val;

    if (t >= 10) {
        rest = t % 10;
        rem = t / 10;
        head->val = rest;
    } else {
        head->val = t;
    }

    pt1 = pt1->next;
    pt2 = pt2->next;
    head->next = NULL;
    struct ListNode *current = head;
    while (pt1 != NULL || pt2 != NULL) {
        struct ListNode *temp = malloc(sizeof(struct ListNode));
        t = rem;
        if (pt1 != NULL) {
            t =t+ pt1->val;
            pt1 = pt1->next;
        }
        if (pt2 != NULL) {
            t =t+ pt2->val;
            pt2 = pt2->next;
        }
        if (t >= 10) {
            rest = t % 10;
            rem = t / 10;
            temp->val = rest;
        } else {
            temp->val = t;
            rem = 0;
        }

        temp->next = NULL;
        current->next = temp;
        current = current->next;
    }
    if (rem > 0) {
        struct ListNode *temp = malloc(sizeof(struct ListNode));
        temp->val = rem;
        temp->next = NULL;
        current->next = temp;
    }

    return head;
}
