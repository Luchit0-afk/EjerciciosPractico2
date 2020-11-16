%include "io.inc"

section .data
    A dd 4
    B dd 6
    C dd 223,1,2,3,4,12,6,7,222,9

section .text
global CMAIN
CMAIN:
    mov ebp, esp; for correct debugging
    
    ;Comparo dos numeros y imprimo el mayor
    xor eax, eax
    mov ebx, [A]
    mov eax, [B]
    call max
    PRINT_DEC 4, eax
    NEWLINE
    
    ;Comparo un arreglo de numeros y imprimo el mayor
    mov eax, [C]
    mov ecx,9
    mov edx,4
  comp
    mov ebx,[C+edx]
    add edx, 4
    call max
    loop comp
    PRINT_DEC 4 , eax
ret

;Pasandole a ebx y eax los valores a comparar,te retorna en eax el mayor 
max
   push ebp
   mov ebp, esp
   cmp ebx,eax
   jg mayor             ;ebx > eax
   jmp fin
 mayor
   mov eax,ebx
 fin
   mov esp, ebp
   pop ebp 
ret
    