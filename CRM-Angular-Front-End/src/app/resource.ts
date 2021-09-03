export class Resource {
    resourceId: number;
    resourceName: string;

    // this is in resource_type table in the database
    resourceType: string;
    
    resourceDescription: string;
    maxCapacity: number;
    avaliableCapacity: number;
    isActive: boolean;

}
