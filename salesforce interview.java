/**
Tag Document Validator

Given a string representing a code snippet, implement a tag validator to parse the code and return whether it is valid.
A code snippet is valid if all the following rules hold:

1. The code must be wrapped in a *valid closed tag*. Otherwise, the code is invalid.
2. A *closed tag* has the following format : <TAG_NAME>TAG_CONTENT</TAG_NAME>.
    1.  <TAG_NAME> is the start tag
    2. </TAG_NAME> is the end tag
    3. The TAG_NAME in start and end tags should be the same
3. A *valid* TAG_NAME: Contains *upper-case letters* and has length in range [1,9]
4. A *valid* TAG_CONTENT, may contain:
    1. Valid closed tags
    2. CDATA
    3. Any characters *EXCEPT* unmatched <, unmatched start and end tag, and unmatched or closed tags with invalid TAG_NAME.
5. A start tag is unmatched if no end tag exists with the same TAG_NAME, and vice versa. 
6. A < is unmatched if you cannot find a subsequent >. And when you find a < or </, all the subsequent characters until the next > should be parsed as TAG_NAME.
7. The CDATA has the following format : <![CDATA[CDATA_CONTENT]]>. The range of CDATA_CONTENT is defined as the characters between <![CDATA[ and the *first subsequent* ]]>. CDATA_CONTENT may contain *any characters*. 

Example

Valid document

<DIV>This <div>is the first line <![CDATA[<div>]]>]]></DIV>

Invalid document

<A>  <B> </A>   </B>
*/

// < > ! [ ] CDATA /

public validateDocumentTags(String str) {
    //validatation
    
    //DS
    Stack<String> s;
    
    //run over str
    int n = str.length();
    char chArr = str.toCharArray();
    int startTagName;
    int startContent;
    int startCDATA;
    
    for(int i=0;i<n;i++) {
        if(chArr[i]=='<'&&chArr[i]!='/') {
             startTagName = i;
            for(;i<n;i++) {
                if(chArr[i]=='>') {
                    String tagName = str.substring(start+1,i-1);
                    if(!validationTagName(tagName)) {
                        if(s.isEmpty()) return false;
                    } else {
                        s.push(str.substring(start+1,i-1));
                        startContent = i+1;
                        break;
                    }
                    
                }
            }
        }
        
        if()
        
        if(chArr[i]=='<'&&chArr[i]=='/') {
        }
        
    }
    
    //if q not empty
    
    //return
    if(s.isEmpty()) {
        return true;
    }
    return false;
}

private validationTagName(){
    
}
