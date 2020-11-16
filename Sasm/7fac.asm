%include "io.inc"

section.data
    N dd 4

section .text
global CMAIN
CMAIN:
    mov ebp, esp; for correct debugging
    mov eax, 1
    mov ecx, [N]
  fac
    imul eax , ecx
    loop fac
    PRINT_DEC 4,eax
ret