%include "io.inc"

section .text
global CMAIN
CMAIN:
    mov ebp, esp; for correct debugging
    mov eax, 0h
    cmp eax,1 
    JP par     
    PRINT_STRING "El numero es impar"            
    NEWLINE
    jmp fin 
  par
    PRINT_STRING "El numero es par"
    NEWLINE
  fin  
    ret
    
    ;Podemos usar el shr y luego el jc?
    ; Con and eax , 1 