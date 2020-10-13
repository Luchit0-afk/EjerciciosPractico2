%include "io.inc"

section .text
global CMAIN
CMAIN:   
    mov ebp, esp; for correct debugging
    mov eax, 1
    shr eax , 1
    jc impar     
    PRINT_STRING "El numero es par"            
    NEWLINE
    jmp fin 
  impar
    PRINT_STRING "El numero es impar"
    NEWLINE
  fin  

ret