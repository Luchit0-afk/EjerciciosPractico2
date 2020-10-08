%include "asm_io.inc"

section .text
global _CMAIN
_CMAIN:
    xor eax, eax
    mov eax, 3
    
    dump_regs 2222
ret 